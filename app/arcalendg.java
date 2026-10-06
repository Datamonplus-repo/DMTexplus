package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.arcalendg", "/app.arcalendg"})
@jakarta.servlet.annotation.MultipartConfig
public final  class arcalendg extends GXWebObjectStub
{
   public arcalendg( )
   {
   }

   public arcalendg( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( arcalendg.class ));
   }

   public arcalendg( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new arcalendg_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new arcalendg_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "LISTADO CALENDARIO Grafico";
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

