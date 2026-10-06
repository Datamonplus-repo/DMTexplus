package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwstm009exportcsv", "/app.webwstm009exportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwstm009exportcsv extends GXWebObjectStub
{
   public webwstm009exportcsv( )
   {
   }

   public webwstm009exportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwstm009exportcsv.class ));
   }

   public webwstm009exportcsv( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwstm009exportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwstm009exportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web WSTM009 Export CSV";
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

