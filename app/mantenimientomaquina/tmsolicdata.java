package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmsolicdata", "/app.mantenimientomaquina.tmsolicdata"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmsolicdata extends GXWebObjectStub
{
   public tmsolicdata( )
   {
   }

   public tmsolicdata( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmsolicdata.class ));
   }

   public tmsolicdata( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmsolicdata_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmsolicdata_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMSolic Data";
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

