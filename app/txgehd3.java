package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.txgehd3", "/app.txgehd3"})
@jakarta.servlet.annotation.MultipartConfig
public final  class txgehd3 extends GXWebObjectStub
{
   public txgehd3( )
   {
   }

   public txgehd3( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( txgehd3.class ));
   }

   public txgehd3( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new txgehd3_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new txgehd3_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "DISTRIBUCION POR PIEZAS";
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

