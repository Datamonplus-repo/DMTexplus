package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wctbllhiprolist", "/app.wctbllhiprolist"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wctbllhiprolist extends GXWebObjectStub
{
   public wctbllhiprolist( )
   {
   }

   public wctbllhiprolist( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wctbllhiprolist.class ));
   }

   public wctbllhiprolist( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wctbllhiprolist_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wctbllhiprolist_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCtbl Lhipro List";
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

