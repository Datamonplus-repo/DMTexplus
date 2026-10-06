package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tminvst", "/app.mantenimientomaquina.tminvst"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tminvst extends GXWebObjectStub
{
   public tminvst( )
   {
   }

   public tminvst( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tminvst.class ));
   }

   public tminvst( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tminvst_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tminvst_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Inventarios de Stock";
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

