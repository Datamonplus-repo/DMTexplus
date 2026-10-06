package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tclimq", "/app.tclimq"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tclimq extends GXWebObjectStub
{
   public tclimq( )
   {
   }

   public tclimq( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tclimq.class ));
   }

   public tclimq( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tclimq_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tclimq_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MARQUILAS P/CLIENTE";
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

