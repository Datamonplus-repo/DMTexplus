package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.mtoformulastinte_ww", "/app.formulaciontinte.mtoformulastinte_ww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mtoformulastinte_ww extends GXWebObjectStub
{
   public mtoformulastinte_ww( )
   {
   }

   public mtoformulastinte_ww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mtoformulastinte_ww.class ));
   }

   public mtoformulastinte_ww( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mtoformulastinte_ww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mtoformulastinte_ww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento de Formulas de Tinte";
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

