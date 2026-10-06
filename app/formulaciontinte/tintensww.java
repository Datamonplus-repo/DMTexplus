package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tintensww", "/app.formulaciontinte.tintensww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tintensww extends GXWebObjectStub
{
   public tintensww( )
   {
   }

   public tintensww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tintensww.class ));
   }

   public tintensww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tintensww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tintensww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " INTENSIDADES";
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

