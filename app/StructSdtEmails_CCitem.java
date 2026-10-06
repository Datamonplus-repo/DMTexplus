package app ;
import com.genexus.*;

public final  class StructSdtEmails_CCitem implements Cloneable, java.io.Serializable
{
   public StructSdtEmails_CCitem( )
   {
      this( -1, new ModelContext( StructSdtEmails_CCitem.class ));
   }

   public StructSdtEmails_CCitem( int remoteHandle ,
                                  ModelContext context )
   {
      gxTv_SdtEmails_CCitem_Email = "" ;
      gxTv_SdtEmails_CCitem_Name = "" ;
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

   public String getEmail( )
   {
      return gxTv_SdtEmails_CCitem_Email ;
   }

   public void setEmail( String value )
   {
      gxTv_SdtEmails_CCitem_N = (byte)(0) ;
      gxTv_SdtEmails_CCitem_Email = value ;
   }

   public String getName( )
   {
      return gxTv_SdtEmails_CCitem_Name ;
   }

   public void setName( String value )
   {
      gxTv_SdtEmails_CCitem_N = (byte)(0) ;
      gxTv_SdtEmails_CCitem_Name = value ;
   }

   protected byte gxTv_SdtEmails_CCitem_N ;
   protected String gxTv_SdtEmails_CCitem_Email ;
   protected String gxTv_SdtEmails_CCitem_Name ;
}

