package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.toperarview", "/app.toperarview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class toperarview extends GXWebObjectStub
{
   public toperarview( )
   {
   }

   public toperarview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( toperarview.class ));
   }

   public toperarview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new toperarview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new toperarview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TOPERARView";
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

