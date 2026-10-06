package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trecarb", "/app.trecarb"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trecarb extends GXWebObjectStub
{
   public trecarb( )
   {
   }

   public trecarb( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trecarb.class ));
   }

   public trecarb( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trecarb_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trecarb_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "RECARGOS CLIENTE/SERIE";
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

