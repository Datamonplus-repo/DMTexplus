package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tclapenprompt", "/app.ficherosbasicos.tclapenprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tclapenprompt extends GXWebObjectStub
{
   public tclapenprompt( )
   {
   }

   public tclapenprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tclapenprompt.class ));
   }

   public tclapenprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tclapenprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tclapenprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Tipos de Familias";
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

