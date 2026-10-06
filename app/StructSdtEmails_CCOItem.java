package app ;
import com.genexus.*;

public final  class StructSdtEmails_CCOItem implements Cloneable, java.io.Serializable
{
   public StructSdtEmails_CCOItem( )
   {
      this( -1, new ModelContext( StructSdtEmails_CCOItem.class ));
   }

   public StructSdtEmails_CCOItem( int remoteHandle ,
                                   ModelContext context )
   {
      gxTv_SdtEmails_CCOItem_Email = "" ;
      gxTv_SdtEmails_CCOItem_Name = "" ;
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
      return gxTv_SdtEmails_CCOItem_Email ;
   }

   public void setEmail( String value )
   {
      gxTv_SdtEmails_CCOItem_N = (byte)(0) ;
      gxTv_SdtEmails_CCOItem_Email = value ;
   }

   public String getName( )
   {
      return gxTv_SdtEmails_CCOItem_Name ;
   }

   public void setName( String value )
   {
      gxTv_SdtEmails_CCOItem_N = (byte)(0) ;
      gxTv_SdtEmails_CCOItem_Name = value ;
   }

   protected byte gxTv_SdtEmails_CCOItem_N ;
   protected String gxTv_SdtEmails_CCOItem_Email ;
   protected String gxTv_SdtEmails_CCOItem_Name ;
}

