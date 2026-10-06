package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tinditexww", "/app.ficherosbasicos.tinditexww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tinditexww extends GXWebObjectStub
{
   public tinditexww( )
   {
   }

   public tinditexww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tinditexww.class ));
   }

   public tinditexww( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tinditexww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tinditexww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Clear to Wear";
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

