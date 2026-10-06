package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.nwdpfases", "/app.nwdpfases"})
@jakarta.servlet.annotation.MultipartConfig
public final  class nwdpfases extends GXWebObjectStub
{
   public nwdpfases( )
   {
   }

   public nwdpfases( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( nwdpfases.class ));
   }

   public nwdpfases( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new nwdpfases_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new nwdpfases_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Nw DPFases";
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

