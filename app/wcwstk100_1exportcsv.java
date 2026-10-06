package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwstk100_1exportcsv", "/app.wcwstk100_1exportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwstk100_1exportcsv extends GXWebObjectStub
{
   public wcwstk100_1exportcsv( )
   {
   }

   public wcwstk100_1exportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwstk100_1exportcsv.class ));
   }

   public wcwstk100_1exportcsv( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwstk100_1exportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwstk100_1exportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCWSTK100_1 Export CSV";
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

