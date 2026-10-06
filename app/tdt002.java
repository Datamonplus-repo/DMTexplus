package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdt002", "/app.tdt002"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdt002 extends GXWebObjectStub
{
   public tdt002( )
   {
   }

   public tdt002( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdt002.class ));
   }

   public tdt002( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdt002_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdt002_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PROCESOS QUIMICOS F(NIT)";
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

