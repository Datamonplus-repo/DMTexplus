package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tgrdtipprompt", "/app.ficherosbasicos.tgrdtipprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tgrdtipprompt extends GXWebObjectStub
{
   public tgrdtipprompt( )
   {
   }

   public tgrdtipprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tgrdtipprompt.class ));
   }

   public tgrdtipprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tgrdtipprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tgrdtipprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Gran Familia Tipo Articulo";
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

