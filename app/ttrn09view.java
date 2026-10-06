package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrn09view", "/app.ttrn09view"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrn09view extends GXWebObjectStub
{
   public ttrn09view( )
   {
   }

   public ttrn09view( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrn09view.class ));
   }

   public ttrn09view( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrn09view_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrn09view_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTrn09 View";
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

