package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tnprovprdtprdger", "/app.tnprovprdtprdger"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tnprovprdtprdger extends GXWebObjectStub
{
   public tnprovprdtprdger( )
   {
   }

   public tnprovprdtprdger( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tnprovprdtprdger.class ));
   }

   public tnprovprdtprdger( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tnprovprdtprdger_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tnprovprdtprdger_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tn PROVPRDTPRDGER";
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

