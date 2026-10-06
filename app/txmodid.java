package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.txmodid", "/app.txmodid"})
@jakarta.servlet.annotation.MultipartConfig
public final  class txmodid extends GXWebObjectStub
{
   public txmodid( )
   {
   }

   public txmodid( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( txmodid.class ));
   }

   public txmodid( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new txmodid_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new txmodid_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Auditoría sobre DISPOS";
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

