package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.mtoformulastinteview", "/app.formulaciontinte.mtoformulastinteview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mtoformulastinteview extends GXWebObjectStub
{
   public mtoformulastinteview( )
   {
   }

   public mtoformulastinteview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mtoformulastinteview.class ));
   }

   public mtoformulastinteview( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mtoformulastinteview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mtoformulastinteview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mto Formulas Tinte View";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

