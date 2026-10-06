package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlproductossinmovimientos_wc", "/app.controlproductossinmovimientos_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class controlproductossinmovimientos_wc extends GXWebObjectStub
{
   public controlproductossinmovimientos_wc( )
   {
   }

   public controlproductossinmovimientos_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( controlproductossinmovimientos_wc.class ));
   }

   public controlproductossinmovimientos_wc( int remoteHandle ,
                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new controlproductossinmovimientos_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new controlproductossinmovimientos_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Control Productos sin Movimientos";
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

