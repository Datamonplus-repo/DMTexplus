package app ;
import com.genexus.*;

public final  class StructSdtEmails_AttachedItem implements Cloneable, java.io.Serializable
{
   public StructSdtEmails_AttachedItem( )
   {
      this( -1, new ModelContext( StructSdtEmails_AttachedItem.class ));
   }

   public StructSdtEmails_AttachedItem( int remoteHandle ,
                                        ModelContext context )
   {
      gxTv_SdtEmails_AttachedItem_Path = "" ;
   }

   public Object clone()
   {
      Object cloned = null;
      try
      {
         cloned = super.clone();
      }catch (CloneNotSupportedException e){ ; }
      return cloned;
   }

   public String getPath( )
   {
      return gxTv_SdtEmails_AttachedItem_Path ;
   }

   public void setPath( String value )
   {
      gxTv_SdtEmails_AttachedItem_N = (byte)(0) ;
      gxTv_SdtEmails_AttachedItem_Path = value ;
   }

   protected byte gxTv_SdtEmails_AttachedItem_N ;
   protected String gxTv_SdtEmails_AttachedItem_Path ;
}

