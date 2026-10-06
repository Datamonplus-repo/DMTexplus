package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.cnarticulo", "/app.cnarticulo"})
@jakarta.servlet.annotation.MultipartConfig
public final  class cnarticulo extends GXWebObjectStub
{
   public cnarticulo( )
   {
   }

   public cnarticulo( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( cnarticulo.class ));
   }

   public cnarticulo( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new cnarticulo_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new cnarticulo_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona ARTICULOS (DATOS TECNICOS)";
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

