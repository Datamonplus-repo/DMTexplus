package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.traspasararticulosatodos", "/app.ficherosbasicos.traspasararticulosatodos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class traspasararticulosatodos extends GXWebObjectStub
{
   public traspasararticulosatodos( )
   {
   }

   public traspasararticulosatodos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( traspasararticulosatodos.class ));
   }

   public traspasararticulosatodos( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new traspasararticulosatodos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new traspasararticulosatodos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Traspasar Articulos un cliente a Todos";
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

