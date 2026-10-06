package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrn09", "/app.ttrn09"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrn09 extends GXWebObjectStub
{
   public ttrn09( )
   {
   }

   public ttrn09( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrn09.class ));
   }

   public ttrn09( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrn09_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrn09_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Guias (Fases)";
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

