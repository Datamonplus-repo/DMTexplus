package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.wcopiaseriecliente", "/app.ficherosbasicos.wcopiaseriecliente"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcopiaseriecliente extends GXWebObjectStub
{
   public wcopiaseriecliente( )
   {
   }

   public wcopiaseriecliente( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcopiaseriecliente.class ));
   }

   public wcopiaseriecliente( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcopiaseriecliente_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcopiaseriecliente_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Ficha Tecnica (Articulo)";
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

