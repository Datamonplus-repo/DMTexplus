package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tclitjh", "/app.tclitjh"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tclitjh extends GXWebObjectStub
{
   public tclitjh( )
   {
   }

   public tclitjh( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tclitjh.class ));
   }

   public tclitjh( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tclitjh_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tclitjh_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ASOCIAR CLIENTES PROCEDENCIA";
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

