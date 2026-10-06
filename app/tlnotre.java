package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tlnotre", "/app.tlnotre"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tlnotre extends GXWebObjectStub
{
   public tlnotre( )
   {
   }

   public tlnotre( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tlnotre.class ));
   }

   public tlnotre( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tlnotre_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tlnotre_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "NOTAS RETORNO,LINEAS";
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

