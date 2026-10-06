package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.imprimirdocumentocomercial", "/app.imprimirdocumentocomercial"})
@jakarta.servlet.annotation.MultipartConfig
public final  class imprimirdocumentocomercial extends GXWebObjectStub
{
   public imprimirdocumentocomercial( )
   {
   }

   public imprimirdocumentocomercial( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( imprimirdocumentocomercial.class ));
   }

   public imprimirdocumentocomercial( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new imprimirdocumentocomercial_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new imprimirdocumentocomercial_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Imprimir Documento Comercial";
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

