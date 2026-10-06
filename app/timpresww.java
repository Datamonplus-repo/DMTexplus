package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.timpresww", "/app.timpresww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class timpresww extends GXWebObjectStub
{
   public timpresww( )
   {
   }

   public timpresww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( timpresww.class ));
   }

   public timpresww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new timpresww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new timpresww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " IMPRESORAS";
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

