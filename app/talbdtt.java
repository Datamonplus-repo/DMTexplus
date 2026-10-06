package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talbdtt", "/app.talbdtt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talbdtt extends GXWebObjectStub
{
   public talbdtt( )
   {
   }

   public talbdtt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talbdtt.class ));
   }

   public talbdtt( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talbdtt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talbdtt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ALBARAN RECEPCION-PZAS-TINTTO";
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

