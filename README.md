解决别人提出需求：在任意界面里面，要弹出一个提示窗，点窗口里的确定后能打开MainActivity的侧滑菜单中的（消息）项目
这个demo大体结构是为了方便，随便在github上下载的。
大概知识点：
baseActivity 里面设置广播监听
然后需要弹窗的Activity都继承至baseActivity
用Activity 改style 作AlertDialogue
MainActivity设置为singleTask模式，并重写
```
@Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);

        boolean toMsgFragment = getIntent().getBooleanExtra("toMsgFragment",false);
        System.out.println("toMsgFragment"+toMsgFragment);
        if (toMsgFragment && pager!=null) pager.setCurrentItem(2);
    }
```

demo只是测试实现，很多地方可以完善。比如不用广播，而用其他的订阅者模式、弹窗加上同步锁之类的
