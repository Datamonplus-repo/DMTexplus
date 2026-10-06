package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdt0022", "/app.tdt0022"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdt0022 extends GXWebObjectStub
{
   public tdt0022( )
   {
   }

   public tdt0022( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdt0022.class ));
   }

   public tdt0022( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdt0022_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdt0022_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PARAMETROS PROCESOS";
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

