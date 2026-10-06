package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdisnot", "/app.tdisnot"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdisnot extends GXWebObjectStub
{
   public tdisnot( )
   {
   }

   public tdisnot( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdisnot.class ));
   }

   public tdisnot( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdisnot_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdisnot_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "DISNOT";
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

