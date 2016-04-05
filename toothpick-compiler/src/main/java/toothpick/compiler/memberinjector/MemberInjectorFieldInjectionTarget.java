package toothpick.compiler.memberinjector;

public final class MemberInjectorFieldInjectionTarget {

  public final String targetClassPackage;
  public final String targetClassName;
  public final String memberClassPackage;
  public final String memberClassName;
  public final String memberName;
  public final String superClassThatNeedsInjectionClassPackage;
  public final String superClassThatNeedsInjectionClassName;
  public final Kind kind;
  public final String kindParamPackageName;
  public final String kindParamClassName;

  public MemberInjectorFieldInjectionTarget(String targetClassPackage, String targetClassName, String memberClassPackage, String memberClassName,
      String memberName, String superClassThatNeedsInjectionClassPackage, String superClassThatNeedsInjectionClassName, Kind kind,
      String kindParamPackageName, String kindParamClassName) {
    this.targetClassPackage = targetClassPackage;
    this.targetClassName = targetClassName;
    this.memberClassPackage = memberClassPackage;
    this.memberClassName = memberClassName;
    this.memberName = memberName;
    this.superClassThatNeedsInjectionClassPackage = superClassThatNeedsInjectionClassPackage;
    this.superClassThatNeedsInjectionClassName = superClassThatNeedsInjectionClassName;
    this.kind = kind;
    this.kindParamPackageName = kindParamPackageName;
    this.kindParamClassName = kindParamClassName;
  }

  public enum Kind {
    INSTANCE,
    PROVIDER,
    LAZY,
    FUTURE
  }
}