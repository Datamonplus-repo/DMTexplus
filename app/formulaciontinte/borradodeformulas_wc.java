package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.borradodeformulas_wc", "/app.formulaciontinte.borradodeformulas_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class borradodeformulas_wc extends GXWebObjectStub
{
   public borradodeformulas_wc( )
   {
   }

   public borradodeformulas_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( borradodeformulas_wc.class ));
   }

   public borradodeformulas_wc( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new borradodeformulas_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new borradodeformulas_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Mto Formulas Tinte";
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

