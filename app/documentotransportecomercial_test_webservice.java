package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentotransportecomercial_test_webservice", "/app.documentotransportecomercial_test_webservice"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentotransportecomercial_test_webservice extends GXWebObjectStub
{
   public documentotransportecomercial_test_webservice( )
   {
   }

   public documentotransportecomercial_test_webservice( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentotransportecomercial_test_webservice.class ));
   }

   public documentotransportecomercial_test_webservice( int remoteHandle ,
                                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentotransportecomercial_test_webservice_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentotransportecomercial_test_webservice_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Test Envio AT";
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

