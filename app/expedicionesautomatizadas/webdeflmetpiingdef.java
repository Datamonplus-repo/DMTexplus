package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.expedicionesautomatizadas.webdeflmetpiingdef", "/app.expedicionesautomatizadas.webdeflmetpiingdef"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webdeflmetpiingdef extends GXWebObjectStub
{
   public webdeflmetpiingdef( )
   {
   }

   public webdeflmetpiingdef( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webdeflmetpiingdef.class ));
   }

   public webdeflmetpiingdef( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webdeflmetpiingdef_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webdeflmetpiingdef_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " TIPOS DEFECTOS";
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

