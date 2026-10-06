package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttrm", "/app.ficherosbasicos.ttrm"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrm extends GXWebObjectStub
{
   public ttrm( )
   {
   }

   public ttrm( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrm.class ));
   }

   public ttrm( int remoteHandle ,
                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrm_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrm_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TRM";
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

