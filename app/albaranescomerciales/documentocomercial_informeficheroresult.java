package app.albaranescomerciales ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.albaranescomerciales.documentocomercial_informeficheroresult", "/app.albaranescomerciales.documentocomercial_informeficheroresult"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentocomercial_informeficheroresult extends GXWebObjectStub
{
   public documentocomercial_informeficheroresult( )
   {
   }

   public documentocomercial_informeficheroresult( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentocomercial_informeficheroresult.class ));
   }

   public documentocomercial_informeficheroresult( int remoteHandle ,
                                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentocomercial_informeficheroresult_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentocomercial_informeficheroresult_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Fichero RESULT.xml";
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

