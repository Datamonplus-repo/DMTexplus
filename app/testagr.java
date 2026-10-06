package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.testagr", "/app.testagr"})
@jakarta.servlet.annotation.MultipartConfig
public final  class testagr extends GXWebObjectStub
{
   public testagr( )
   {
   }

   public testagr( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( testagr.class ));
   }

   public testagr( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new testagr_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new testagr_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TRAVER AGRUP ESTAMPACION";
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

