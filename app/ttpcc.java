package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttpcc", "/app.ttpcc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttpcc extends GXWebObjectStub
{
   public ttpcc( )
   {
   }

   public ttpcc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttpcc.class ));
   }

   public ttpcc( int remoteHandle ,
                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttpcc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttpcc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TEST PILLING,PARM";
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

