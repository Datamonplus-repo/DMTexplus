package app.calidad ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.calidad.wwimprimirncartigo", "/app.calidad.wwimprimirncartigo"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wwimprimirncartigo extends GXWebObjectStub
{
   public wwimprimirncartigo( )
   {
   }

   public wwimprimirncartigo( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wwimprimirncartigo.class ));
   }

   public wwimprimirncartigo( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wwimprimirncartigo_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wwimprimirncartigo_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ww Imprimir NC por Artigo";
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

