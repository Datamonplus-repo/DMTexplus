package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trecalm", "/app.trecalm"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trecalm extends GXWebObjectStub
{
   public trecalm( )
   {
   }

   public trecalm( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trecalm.class ));
   }

   public trecalm( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trecalm_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trecalm_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "RECUENTOS POR ALMACEN";
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

