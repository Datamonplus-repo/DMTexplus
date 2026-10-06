package app.wwpbaseobjects ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class loaduserkeyvalue extends GXProcedure
{
   public loaduserkeyvalue( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( loaduserkeyvalue.class ), "" );
   }

   public loaduserkeyvalue( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 )
   {
      loaduserkeyvalue.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 )
   {
      loaduserkeyvalue.this.AV11UserCustomizationsKey = aP0;
      loaduserkeyvalue.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12UserCustomizationsValue = AV8Session.getValue(AV11UserCustomizationsKey) ;
      if ( (GXutil.strcmp("", AV12UserCustomizationsValue)==0) )
      {
         GXv_SdtWWPContext1[0] = AV14WWPContext;
         new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
         AV14WWPContext = GXv_SdtWWPContext1[0] ;
         AV15UserCustom.Load(AV14WWPContext.getgxTv_SdtWWPContext_Userid(), AV11UserCustomizationsKey);
         if ( AV15UserCustom.Success() )
         {
            AV12UserCustomizationsValue = AV15UserCustom.getgxTv_SdtUserCustom_Usrcusval() ;
         }
         else
         {
            AV12UserCustomizationsValue = "" ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = loaduserkeyvalue.this.AV12UserCustomizationsValue;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12UserCustomizationsValue = "" ;
      AV8Session = httpContext.getWebSession();
      AV14WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV15UserCustom = new app.wwpbaseobjects.SdtUserCustom(remoteHandle);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV12UserCustomizationsValue ;
   private String AV11UserCustomizationsKey ;
   private com.genexus.webpanels.WebSession AV8Session ;
   private String[] aP1 ;
   private app.wwpbaseobjects.SdtWWPContext AV14WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtUserCustom AV15UserCustom ;
}

