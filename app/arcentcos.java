package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.arcentcos", "/app.arcentcos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class arcentcos extends GXWebObjectStub
{
   public arcentcos( )
   {
   }

   public arcentcos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( arcentcos.class ));
   }

   public arcentcos( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new arcentcos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new arcentcos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "LISTADO P/CENTRO DE COSTES";
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

