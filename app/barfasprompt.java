package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.barfasprompt", "/app.barfasprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class barfasprompt extends GXWebObjectStub
{
   public barfasprompt( )
   {
   }

   public barfasprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( barfasprompt.class ));
   }

   public barfasprompt( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new barfasprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new barfasprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Tabla BARFAS";
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

