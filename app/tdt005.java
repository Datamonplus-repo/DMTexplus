package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdt005", "/app.tdt005"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdt005 extends GXWebObjectStub
{
   public tdt005( )
   {
   }

   public tdt005( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdt005.class ));
   }

   public tdt005( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdt005_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdt005_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TABLA BARFAS-PQUIMICO";
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

