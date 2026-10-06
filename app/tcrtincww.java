package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcrtincww", "/app.tcrtincww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcrtincww extends GXWebObjectStub
{
   public tcrtincww( )
   {
   }

   public tcrtincww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcrtincww.class ));
   }

   public tcrtincww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcrtincww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcrtincww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Control de Incidencias";
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

