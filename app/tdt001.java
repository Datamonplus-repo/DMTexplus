package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdt001", "/app.tdt001"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdt001 extends GXWebObjectStub
{
   public tdt001( )
   {
   }

   public tdt001( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdt001.class ));
   }

   public tdt001( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdt001_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdt001_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TABLAB OP-ORDEN-PQUIMICO";
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

