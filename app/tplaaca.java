package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tplaaca", "/app.tplaaca"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tplaaca extends GXWebObjectStub
{
   public tplaaca( )
   {
   }

   public tplaaca( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tplaaca.class ));
   }

   public tplaaca( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tplaaca_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tplaaca_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PLANIFICACION ACABADOS";
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

