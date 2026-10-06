package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wc_testcol", "/app.wc_testcol"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wc_testcol extends GXWebObjectStub
{
   public wc_testcol( )
   {
   }

   public wc_testcol( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wc_testcol.class ));
   }

   public wc_testcol( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wc_testcol_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wc_testcol_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Colores p/estampación";
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

